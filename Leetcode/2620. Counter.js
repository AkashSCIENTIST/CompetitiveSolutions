var createCounter = function(n) {
    let val = n;
    return function() {
        return n++;
    };
};
