from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Seven!" }
    .to("log:info")
