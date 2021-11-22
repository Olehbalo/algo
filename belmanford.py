from sys import maxsize


def BellmanFord(graph, vertices ,  edges , src):

    dis = [maxsize] * vertices
    dis[src] = 0

    for i in range(vertices - 1):
        for j in range(edges):
            if dis[graph[j][0]] + \
                graph[j][2] < dis[graph[j][1]]:
                dis[graph[j][1]] = dis[graph[j][0]] + \
                                    graph[j][2]


    for i in range(edges):
        x = graph[i][0]
        y = graph[i][1]
        weight = graph[i][2]
        if dis[x] != maxsize and dis[x] + \
                        weight < dis[y]:
            print("Graph contains negativerticese weight cycle")

    print("Distance to the top from the beginning")
    for i in range(vertices):
        print("%d\t\t%d" % (i, dis[i]))


if __name__ == "__main__":
    vertices = 5 
    edges = 8 

    
    graph = [[0, 1, -1], [0, 2, 4], [1, 2, 3],
            [1, 3, 2], [1, 4, 2], [3, 2, 5],
            [3, 1, 1], [4, 3, -3]]
    BellmanFord(graph, vertices, edges, 0)
