from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Eight!" }
    .to("log:info")
