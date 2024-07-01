var createCounter = function(init) {
    val = init;
    return {
        increment : () => {
            return ++val;
        },
        decrement : () => {
            return --val;
        },
        reset : () => {
            val = init;
            return val;
        }
    }
};
