(function(window) {
	function goda5() {
		return this;
	};

	goda5.prototype = {
		toggle : function() {
			return this;
		}
	};

	goda5.about = function() {
        return "0.1";
    };
    
	window.goda5 = window.g$ = goda5;
})(window);