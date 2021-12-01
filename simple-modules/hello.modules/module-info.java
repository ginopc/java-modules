module hello.modules {
  exports it.ginopc.modules.hello;

  provides it.ginopc.modules.hello.HelloInterface with it.ginopc.modules.hello.HelloModules;
}