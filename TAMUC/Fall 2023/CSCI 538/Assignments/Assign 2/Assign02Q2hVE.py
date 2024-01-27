# Victor Ejiasi
# 10/3/23
# This program finds the number of islands and the maximum area of an island in a randomly generated grid.

import numpy as np

def dfs(x, y, visited, grid):
    if x < 0 or y < 0 or x >= grid.shape[0] or y >= grid.shape[1] or visited[x][y] or grid[x][y] == 0:
        return 0

    visited[x][y] = True

    area = 1
    area += dfs(x-1, y, visited, grid)
    area += dfs(x+1, y, visited, grid)
    area += dfs(x, y-1, visited, grid)
    area += dfs(x, y+1, visited, grid)

    return area

def find_islands(grid):
    visited = np.zeros(grid.shape, dtype=bool)
    num_islands = 0
    max_area = 0

    for i in range(grid.shape[0]):
        for j in range(grid.shape[1]):
            if not visited[i][j] and grid[i][j] == 1:
                area = dfs(i, j, visited, grid)
                num_islands += 1
                max_area = max(max_area, area)

    return num_islands, max_area

if __name__ == "__main__":
    while True:
        rows, cols = map(int, input("Enter the number of rows and columns separated by space: ").split())
        grid = np.random.randint(2, size=(rows, cols))
        print("Random Grid:")
        print(grid)
        
        num_islands, max_area = find_islands(np.copy(grid))
        print(f"Number of Islands: {num_islands}")
        print(f"Maximum Area of an Island: {max_area}")

        user_input = input("Do you want to generate another grid? (y/n): ")
        if user_input.lower() != 'y':
            break
