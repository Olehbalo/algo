import unittest
from main import rabin_karp


class TestRabinKarp(unittest.TestCase):
    def test1(self):
        self.assertEqual([4, 11], rabin_karp("Hello session!", "o"))
        self.assertEqual([6], rabin_karp("Hello session!", "ses"))

    def test2(self):
        self.assertEqual([], rabin_karp("HIolehds", ""))

    def test3(self):
        self.assertEqual(
            [2, 13, 28],
            rabin_karp("I am Oleh, I am eighteen, I am study in Lviv", "am")
        )

    def test4(self):
        self.assertEqual(
            [],
            rabin_karp("Rabin-Karp algorithm is an algorithm used to find / match patterns in text using a hash function", "Ukraine")
        )


if __name__ == '__main__':
    unittest.main()