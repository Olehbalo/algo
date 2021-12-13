NO_OF_CHARS = 256


def badCharHeuristic(string, size):
    badChar = [-1] * NO_OF_CHARS

    for i in range(size):
        badChar[ord(string[i])] = i;

    return badChar


def boyer_moore(text, pat):

    pattern_len = len(pat)
    text_len = len(text)

    badChar = badCharHeuristic(pat, pattern_len)

    shift = 0
    while (shift <= text_len  - pattern_len):
        j =pattern_len - 1

        while j >= 0 and pat[j] == text[shift + j]:
            j -= 1

        if j < 0:
            print("Pattern occur at shift = {}".format(shift))
            shift += (pattern_len - badChar[ord(text[shift + pattern_len])] 
                if shift + pattern_len < text_len  else 1)
        else:

            shift += max(1, j - badChar[ord(text[shift + j])])

        # Driver program to test above function



if __name__ == '__main__':
    txt = "Hello, the session is nears"
    pat = "sion"
    boyer_moore(txt, pat)