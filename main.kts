from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Six!" }
    .to("log:info")
