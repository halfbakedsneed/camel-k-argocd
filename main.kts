from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Dude!" }
    .to("log:info")
