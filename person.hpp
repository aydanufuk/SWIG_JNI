#include <string>

class PersonC {
public:
  PersonC(const std::string&, int);
  const std::string& get_name() const;
  void set_name(std::string&);
  int get_age() const;
  void set_age(int);
private:
  std::string name_;
  int age_;
};