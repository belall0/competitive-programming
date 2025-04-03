/*
 * url: https://vjudge.net/solution/59697808/zr2pGq4dzH8As2105a1o
 * date: 03 - 04 - 2025
 */
#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  vector<pair<string, int>> output;
  priority_queue<int, vector<int>, greater<int>> pq;

  while (n--)
  {
    string oper{};
    int result{};

    cin >> oper;

    if (oper != "removeMin")
    {
      cin >> result;
    }

    if (oper == "insert")
    {
      pq.push(result);
      output.push_back(make_pair(oper, result));
    }

    else if (oper == "removeMin")
    {
      if (pq.empty())
        output.push_back(make_pair("insert", 1));
      else
        pq.pop();

      output.push_back(make_pair(oper, -1));
    }

    else if (oper == "getMin")
    {
      if (pq.empty())
      {
        pq.push(result);

        output.push_back(make_pair("insert", result));
        output.push_back(make_pair(oper, result));
      }
      else if (pq.top() == result)
      {
        output.push_back(make_pair(oper, result));
      }

      else if (pq.top() > result)
      {
        pq.push(result);

        output.push_back(make_pair("insert", result));
        output.push_back(make_pair(oper, result));
      }
      else if (pq.top() < result)
      {
        while (!pq.empty() && pq.top() < result)
        {
          output.push_back(make_pair("removeMin", -1));
          pq.pop();
        }
        if (pq.top() != result)
        {
          pq.push(result);
          output.push_back(make_pair("insert", result));
        }

        output.push_back(make_pair(oper, result));
      }
    }
  }

  // printing output
  cout << output.size() << "\n";
  for (int i = 0; i < output.size(); i++)
  {
    string oper = output[i].first;
    int value = output[i].second;

    if (oper == "removeMin")
    {
      cout << oper << "\n";
      continue;
    }

    cout << oper << " " << value << "\n";
  }
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  solution();

  return 0;
}
