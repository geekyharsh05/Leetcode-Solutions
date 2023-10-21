class MyHashMap {
  private map: Map<number, number>;

  constructor() {
    this.map = new Map();
  }

  put(key: number, value: number): void {
    this.map.set(key, value);
  }

  get(key: number): number {
    return this.map.get(key) ?? -1;
  }

  remove(key: number): void {
    this.map.delete(key);
  }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = new MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */