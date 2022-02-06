from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Two!" }
    .to("log:info")
