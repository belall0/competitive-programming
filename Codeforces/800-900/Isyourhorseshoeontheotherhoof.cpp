/*
 * url: https://vjudge.net/solution/58956156/Db5nHss53gHyoSv2hlup
 * date: 07 - 03 - 2025
 * category: implementation
 * complexity: O(1)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int cnt{4};

  set<int> st;

  while (cnt--)
  {
    int num{};
    cin >> num;
    st.insert(num);
  }
  cout << 4 - st.size() << "\n";

  return 0;
}