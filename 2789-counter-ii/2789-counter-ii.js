var createCounter = function(init) {
    const initial = init;
    function inner() {
        return {
            increment: function() {
                return ++init;
            },
            decrement: function() {
                return --init;
            },
            reset: function() {
                init = initial;
                return init;
            }
        }
    }
    return inner();
};