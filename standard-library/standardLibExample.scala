scala> val reader = CSVReader.open(new File("sample.csv"))
reader: com.github.tototoshi.csv.CSVReader = com.github.tototoshi.csv.CSVReader@36d0c6dd

scala> reader.all()
res0: List[List[String]] = List(List(a, b, c), List(d, e, f))

scala> reader.close()
