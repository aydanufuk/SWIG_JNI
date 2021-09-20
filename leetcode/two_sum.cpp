class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        vector<int> result;
        map<int,int> mapper;
        
        mapper[nums[0]] = 0;
        
        for(auto i = 1;i < nums.size();i++){
            
            if(mapper.find(target - nums[i]) != mapper.end())
            {
                result.push_back(mapper[target - nums[i]]);
                result.push_back(i);
            }
            else
            {
                mapper[nums[i]] = i;
            }
           
    }
        
        return result;
    }
};