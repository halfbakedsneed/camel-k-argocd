from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Three!" }
    .to("log:info")
