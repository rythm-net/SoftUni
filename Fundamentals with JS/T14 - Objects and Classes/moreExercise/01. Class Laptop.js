class Laptop {
    isOn = false;
    quality = 0;

    constructor(info, number) {
        (this.info = info), (this.quality = number);
    }

    turnOn() {
        this.quality--;
        this.isOn = true;
    }

    turnOff() {
        this.quality--;
        this.isOn = false;
    }

    showInfo() {
        return JSON.stringify(this.info);
    }

    get price() {
        return 800 - this.info.age * 2 + this.quality * 0.5;
    }
}