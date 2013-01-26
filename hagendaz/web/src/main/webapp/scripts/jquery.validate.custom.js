(function(c) {
	c.validator.defaults.onfocusout = function(element, event) {
		if (!this.checkable(element) && (element.name in this.submitted || !this.optional(element))) {
			validateAgainstGroup(element, this);
		}
	};

	function validateAgainstGroup(element, validator) {
		var key = null;
		var invalidElementKey = null;
		var selectedElementContainsError = false;
		var hasGroup = false;
		for (key in validator.groups) {
			if (validator.groups[key] == validator.groups[element.name]) {
				hasGroup = true;
				if (validator.element(document.getElementsByName(key)[0]) == false) {
					invalidElementKey = key;
					if (key == element.name) {
						selectedElementContainsError = true;
						break;
					}
				}
			}
		}
		if (selectedElementContainsError) {
			validator.element(element);
		} else {
			if (invalidElementKey != null) {
				validator.element(document.getElementsByName(invalidElementKey)[0]);
			}
		}
		if (!hasGroup) {
			validator.element(element);
		}
	};

})(jQuery);

