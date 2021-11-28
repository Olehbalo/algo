import math

class Graph:
    def __init__(self, graph, source, depth):
        self.graph: list = graph
        self.lines = len(graph)
        self.source = source
        self.depth = depth

    def algorithm_bfs(self, parent):
        queue = []
        visited = []

        for i in range(0, self.lines):
            visited.append(0)
        queue.append(self.source)
        visited[self.source] = True
        parent[self.source] = -1

        while len(queue) > 0:
            line = queue.pop(0)
            for column in range(0, self.lines):
                
                if visited[column] == False and self.graph[line][column] > 0:
                    queue.append(column)
                    visited[column] = True
                    parent[column] = line

        if visited[self.depth]:
            return True
        else:
            return False

    def ford(self):
        max_flow: int = 0
        
        parent = [-1] * self.lines

        while self.algorithm_bfs(parent):
            path_flow = math.inf
            column = self.depth

            while column != self.source:
                line = parent[column]
                path_flow = min(path_flow, self.graph[line][column])
                column = parent[column]
            column = self.depth

            while column != self.source:
                line = parent[column]
                self.graph[line][column] -= path_flow
                self.graph[column][line] += path_flow
                column = parent[column]
            max_flow += path_flow

        return max_flow


if __name__ == '__main__':
    graph = [
        [0, 5, 15, 0, 0, 20],
        [0, 0, 0, 35, 0, 0],
        [0, 0, 0, 0, 10, 0],
        [0, 0, 0, 0, 5, 0]
    ]
    g = Graph(graph, source=0, depth=3)
    print(f"Max Flow: {g.ford()}")
