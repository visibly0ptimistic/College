import multiprocessing as mp
import numpy as np
import time

# data
np.random.RandomState(100)
arr = np.random.randint(0, 10, size=[200000, 5])
data = arr.tolist()
results = []

def howmany_within_range(row, minimum, maximum):
    count = 0
    for n in row:
        if minimum <= n <= maximum:
            count = count + 1
    return count
    


if __name__ == '__main__':
    start_time = time.time()
    
    print("is this running 10 times")

    for row in data:
        results.append(howmany_within_range(row, minimum=4, maximum=8))

    print(results[:10])
    print("---non-parallel ran in %s seconds ---" % (time.time() - start_time))


    pool = mp.Pool(mp.cpu_count())
    results = [pool.apply(howmany_within_range, args=(row, 4, 8)) for row in data]
    pool.close()
    
    
    print(results[:10])
    print("---non-parallel ran in %s seconds ---" % (time.time() - start_time))