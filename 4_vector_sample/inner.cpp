#include "inner.hpp"

double inner_product(const std::vector<double>& a,
                     const std::vector<double>& b) {
  double ret_val = 0;
  for (size_t i = 0; i < a.size(); ++i) {
    ret_val += a[i] * b[i];
  }
  return ret_val;
}