
class TestDataEmptyArray(object):
    
    @staticmethod
    def get_array():
        return []
        # complete this function

class TestDataUniqueValues(object):
    data = []
    for i in range(5):
        data.append(i)
    data[::-1]  
    @staticmethod
    def get_array():
        return TestDataUniqueValues.data
    @staticmethod
    def get_expected_result():
        data = TestDataUniqueValues.get_array()
        return data.index(min(data))
        # complete this function

class TestDataExactlyTwoDifferentMinimums(object):
    data = []
    for i in range(5):
        data.append(i)
    data[::-1] 
    data.insert(0,0)
    
    @staticmethod
    def get_array():
        return TestDataExactlyTwoDifferentMinimums.data
    @staticmethod
    def get_expected_result():
        data = TestDataExactlyTwoDifferentMinimums.get_array()
        return data.index(min(data))
