#include <random>
#include <iostream>

#include "matrix.hpp"

std::vector<std::vector<double>> create() {
  std::random_device rnd {};
  std::vector<std::vector<double>> m {};
  for (size_t i = 0; i < 3; ++i) {
    std::vector<double> v {};    
    for (size_t j = 0; j < 3; ++j) {
      v.push_back(rnd());
    }
    m.push_back(v);
  }
  return m;
}

void print_matrix(const std::vector<std::vector<double>>& m) {
  std::cout << "[" << std::endl;
  for (const auto& r : m) {
    std::cout << "  ";
    for (const auto& e : r) {
      std::cout << e << " " ;
    }
    std::cout << std::endl;  
  }
  std::cout << "]" << std::endl;  
}