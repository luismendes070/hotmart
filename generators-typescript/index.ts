function* fibonacci() {
    var a = yield 1;
    yield a * 2;
  }
  
  var it = fibonacci();
  console.log(it);          // "Generator {  }"
  console.log(it.next());   // 1
  console.log(it.send(10)); // 20
  console.log(it.close());  // undefined
  console.log(it.next());   // throws StopIteration (Como o generator está fechado)
  