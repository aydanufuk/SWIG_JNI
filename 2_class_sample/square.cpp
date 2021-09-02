#include "square.hpp"

SquareC::SquareC(double x, double y) : height_(x), width_(y) {
}

//Returns the area
double SquareC::area() {
  return height_ * width_;
}