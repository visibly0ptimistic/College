import multiprocessing as mp
import numpy as np
import time


# data
np.random.RandomState(100)
arr = np.random.randint(0, 10, size=[200000, 5])
data = arr.tolist()

print("why is this running 10 times")

# define func
def howmany_within_range(row, minimum, maximum):
    count = 0
    for n in row:
        if minimum <= n <= maximum:
            count = count + 1
    return count


results = []

start_time = time.time()
for row in data:
    results.append(howmany_within_range(row, minimum=4, maximum=8))


print(results[:10])
print("---non-parallel ran in %s seconds ---" % (time.time() - start_time))

start_time = time.time()
if __name__ == '__main__':
    with mp.Pool(mp.cpu_count()) as p:
        results = [p.apply(howmany_within_range, args=(row, 4, 8)) for row in data]

    print(results[:10])
    print("---parallel ran in %s seconds ---" % (time.time() - start_time))




