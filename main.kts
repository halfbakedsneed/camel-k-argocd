from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Eightz!" }
    .to("log:info")
