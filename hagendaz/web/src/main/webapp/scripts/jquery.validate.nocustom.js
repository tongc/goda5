$.validator.defaults.onfocusout = function(element, event) {
	if (!this.checkable(element) && (element.name in this.submitted || !this.optional(element))) {
		validateAgainstGroup(element, this);
	}
};

function validateAgainstGroup(element, validator) {
	if (element == null || validator == null)
		return;
	validator.element(element);
};
