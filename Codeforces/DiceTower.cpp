/*
 * url: https://vjudge.net/solution/59028762/RNawQu6gAUinHcVuojD9
 * date: 09 - 03 - 2025
 * category: implementation
 * complexity: (n * Log(n))
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{}, x{};
  cin >> n >> x;

  vector<pair<int, int>> v(n);
  for (int i = 0; i < n; i++)
    cin >> v[i].first >> v[i].second;

  int last_bottom{7 - x};
  bool is_valid{true};
  for (int i = 0; i < n; i++)
  {
    int top{7 - last_bottom};
    set<int> st;
    st.insert({v[i].first, v[i].second, 7 - v[i].first, 7 - v[i].second});

    if (st.find(top) != st.end())
    {
      is_valid = false;
      break;
    }

    last_bottom = 7 - top;
  }

  cout << (is_valid ? "YES" : "NO") << "\n";
}

int main()
{

  solution();

  return 0;
}