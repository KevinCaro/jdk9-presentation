// takeWhile
Stream.of(10, 20, 30, 40, 5, 60, 70, 80, 90).takeWhile(num -> num >= 10).map(num -> num * 2).forEach(System.out::println);
// dropWhile
Stream.of(10, 20, 30, 40, 5, 60, 70, 80, 90).dropWhile(num -> num >= 10).forEach(System.out::println);
// iterate avec unary operator
// Stream.iterate(0, i -> ++i).forEach(System.out::println);
Stream.iterate(0, i -> ++i).limit(15).forEach(System.out::println);
// iterate 2e version
Stream.iterate(0, i -> i < 15, i -> ++i).forEach(System.out::println);
