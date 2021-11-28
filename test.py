import unittest
from main import Graph


class TestMain(unittest.TestCase):

    def test_ford(self):
        graph = [[0, 10, 5, 0],
                [0, 0, 0, 20],
                [0, 0, 0, 5]]
        g = Graph(graph, source=0, sink=2)

        expected = 5
        self.assertEqual(g.ford(), expected)
