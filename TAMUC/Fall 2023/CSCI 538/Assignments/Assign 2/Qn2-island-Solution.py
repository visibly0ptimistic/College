import random

def generate(rows, cols):
    # Randomly generate a grid with 0s and 1s
    #rows, cols = 8,13
    grid = [[random.randint(0, 1) for _ in range(cols)] for _ in range(rows)]
    return grid

def printGrid(map):
      # Check the size 
    m=len(map)
    n=len(map[0])
    print (m,'x',n)
    print("\nThis is the Map\n")

    for i in range(len(map)):
        print(map[i])
    print()

def dfsArea(x, y,row,col,visited):
    directions=[(-1,0),(0,1),(1,0),(0,-1)]
    area = 1
    for dx, dy in directions:
        nx,ny = x+dx, y+dy
        if 0<=nx<row and 0<=ny<col and (nx,ny) not in visited and grid[nx][ny]:
            visited.add((nx,ny))
            area+=dfsArea(nx,ny,row,col,visited)
    return area

def dfsIsland(x, y, pos, row,col,visited,island_direction):
    directions=[(-1,0),(0,1),(1,0),(0,-1)]
    for dx, dy in directions:
        nx,ny=x+dx,y+dy
        if 0<=nx <row and 0<= ny <col and grid[nx][ny] and (nx,ny) not in visited:
            temp_direction = (pos[0]+dx, pos[1]+dy)
            visited.add((nx,ny))
            island_direction.append(temp_direction)
            dfsIsland(nx, ny, temp_direction,row,col,visited,island_direction)
    return tuple(island_direction)

# Number of Islands
def numDistinctIslands(grid):
    row = len(grid)
    col = len(grid[0])
    shapes = set()
    visited=set()
    
    for x in range(row):
        for y in range(col):
            if grid[x][y] and (x,y) not in visited:
                visited.add((x,y))
                shapes.add(dfsIsland(x,y,(0,0),row,col,visited,[(0,0)]))
    return len(shapes)

# Max Area
def getMaxArea(grid):
    visited=set()
    max_size = 0
    row,col = len(grid),len(grid[0])
    for x in range(row):
        for y in range(col):
            if grid[x][y] and (x,y) not in visited:
                visited.add((x,y))
                max_size = max(dfsArea(x,y,row,col,visited), max_size)
    return max_size

# start 

if __name__== "__main__":
    # generate a random grid
    m, n = 8,13
    grid = generate(m,n)
    # Use the grid in Assignment02-Qn2
    #grid = [0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0], [0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0], [0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0], [0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0]
    printGrid(grid)
    #numIsland = getlandCount(grid)
    numIsland = numDistinctIslands(grid)
    maxArea =getMaxArea(grid)

    print(f"There are {numIsland} islands, and the largest island has an area of {maxArea}")
    print(f"the largest island has an area of {maxArea}")
