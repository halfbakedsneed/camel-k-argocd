from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Five!" }
    .to("log:info")
