from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Dudez!" }
    .to("log:info")
