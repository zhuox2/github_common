/*
1，构造函数：随着类的加载而执行，可用于对象进行初始化。
2，格式：构造函数没有返回值 ，构造函数名与类名相同。 --->   类名 ( 参数列表) { 执行语句  }
3，当类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数。
4，当自定义构造函数时，系统不会加空参数的构造函数。
5，构造函数具备函数的重载。
6，当分析事物时，该事物村长具备一些特性或者行为，那么将这些内容定义在构造函数中。
7，当构造函数被私有化时，不能创建对应的对象。
8，系统自动创建构造函数权限与该类相同。
----------------------------------------------------------------------------------------------------

1，构造代码块：给对象进行初始化。
2，对象一建立就运行，而且优先于构造函数执行。
3，构造代码块是给所有对象进行统一初始化，也就是给不同对象共性内容统一初始化，而构造函数是给对应的对象初始化。
*/