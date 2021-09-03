#include <string>
#include "person.hpp"

PersonC::PersonC(const std::string& name, int age) : name_(name), age_(age) {}

const std::string& PersonC::get_name() const {
  return name_;
}

void PersonC::set_name(std::string& name) {
  name_ = name;
}

int PersonC::get_age() const {
  return age_;
}

void PersonC::set_age(int age) {
  age_ = age;
}