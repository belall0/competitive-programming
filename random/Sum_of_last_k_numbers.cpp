#include <bits/stdc++.h>
using namespace std;

struct last_k_numbers_sum_stream
{
  int k{};
  queue<int> nums;
  int sum;

  last_k_numbers_sum_stream(int _k)
  {
    k = _k;
    sum = 0;
  }

  int next(int new_num)
  {
    nums.push(new_num);
    if (nums.size() > 4)
    {
      sum -= nums.front();
      nums.pop();
    }

    sum += nums.back();
    return sum;
  }
};

int main()
{
  last_k_numbers_sum_stream solution(4);

  int num{};
  while (cin >> num)
    cout << solution.next(num) << "\n";

  return 0;
}