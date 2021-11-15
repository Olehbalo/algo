#include <algorithm>
#include <iostream>

using namespace std;

int main() {
    const int li = 10;
    int t = 1, co, ag;
    int a[li];

    while (t--) {
        cout << "Enter all cows:";
        cin >> co;
        cout << "Number agressive cows:";
        cin >> ag;
        for (int r = 0; r < co; r++) {
            cout << "Number section:";
            cin >> a[r];
        }
        sort(a, a + co);

        
        int mid = 0;
        for (int low = 0,  high = a[co - 1]; low <= high; ) {
            mid = (low + high + 1) / 2;
            int count = 1,
            left = 0;
            
        for (int right = 1; right < co && count < ag; right++) {
            if (a[right] - a[left] >= mid)
            left = right, count++;
        }
        if (count >= ag) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
            }
        
        }
        cout << mid << endl;
    }

    return 0;
}