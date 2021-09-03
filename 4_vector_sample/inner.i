%module inner
%include <std_vector.i>

%{
  #include "inner.hpp"
%}

%include "inner.hpp"
%template(DVec) std::vector<double>;