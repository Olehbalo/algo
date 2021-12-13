import unittest

from boyermoore import *

class TestMoore(unittest.TestCase):

    def test_boyer_moore_1(self):
        text = "Hello, the session is nears"
        pat = "i"
        self.assertEqual(boyer_moore(text, pat), [15, 19])

    def test_boyer_moore_2(self):
        text = "Hello, the session is nears"
        pat = ""
        self.assertEqual(boyer_moore(text, pat ), [None])