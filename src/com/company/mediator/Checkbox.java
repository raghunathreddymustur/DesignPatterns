package com.company.mediator;

class Checkbox extends Component {
    private boolean checked = false;

    public void setChecked(boolean checked) {
        this.checked = checked;
        changed("checkedChanged");
    }

    public boolean isChecked() {
        return checked;
    }
}
