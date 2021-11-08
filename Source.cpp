#include <algorithm>
#include <iostream>

using namespace std;
const int me = 5;

int t = 1, n, c;
int a[me];
int main() {
    ios_base::sync_with_stdio(0);

    while (t--) {
        cout << "Enter cows:";
        cin >> n;
        cout << "Enter agressive cows:";
        cin >> c;
        for (int i = 0; i < n; i++) {
            cout << "Enter section:";
            cin >> a[i];
        }
        sort(a, a + n);

        int low = 0, high = a[n - 1], mid, best = 0;
        while (low <= high) {
            mid = (low + high + 1) / 2;
            int cnt = 1, left = 0;
            for (int i = 1; i < n && cnt < c; i++) {
                if (a[i] - a[left] >= mid)
                    left = i, cnt++;
            }
            if (cnt >= c) {
                best = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        cout << best << endl;
    }

    return 0;
}