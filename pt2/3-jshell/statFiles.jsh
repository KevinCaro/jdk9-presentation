//usr/bin/env jshell "$0" "$@"; exit $?
List<String> cmdArray = Files.list(Paths.get("..")).map(Path::toString).collect(Collectors.toList())
cmdArray.add(0, "stat")
new ProcessBuilder(cmdArray).redirectErrorStream(true).start().getInputStream().transferTo(System.out)
/exit
