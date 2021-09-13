%module matrix
%include <std_vector.i>
%{
	#include "matrix.hpp"
%}
%include "matrix.hpp"
%template (Dmatrix) std::vector<std::vector<double>>;
%template (DVec) std::vector<double>;