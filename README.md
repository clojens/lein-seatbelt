# seatbelt

A Leiningen plugin to do many wonderful things.

## Personal workflow

### Manual

Usually one of the following project creation argumented (sub)commands:

* `lein new {plugin} ${APPNAME}`
* or `lein new pedestal-{app, service} ${APPNAME} no-comment`
* or `lein new luminus ${APPNAME} +site +db +etc`
* or `lein new joodo ${APPNAME}`

Manually work the `project.clj` file dependencies to include some commonly
used libraries/packages e.g.

```clj
:dependencies
[[hiccup "LATEST"]
 [prismatic/plumbing "LATEST"]
 [garden "LATEST"]
 [backtick "LATEST"]
 [frak "LATEST"]
 [clj-markdown "LATEST"]
 [http-kit "LATEST"]
 [swiss-arrows "LATEST"]]
```

Of course I could have easily used profiles and then just include them
in the final (uber)jar but anyway...

Now if I was really lazy and say working on the [LightTable][lt] IDE
(Insta)REPL and didn't feel like restarting a JVM instance to just add
additional dependencies/plugins, I'd be smart and add `[cemerick/pomegranate "LATEST"]`
(or use the actual version number you please) to file `/opt/LightTable/plugins/clojure/project.clj`
Then I'd be able to (down)load dependencies on-the-fly.

## Some initial ideas

### Scaffolding

* folders (mkdir's according to 'project folder' hierarchies)
* temp / testing / data / log / config / library dir structures

For both readability and overall niceness a `tree` structure could be
parsed / read.




## Usage

FIXME: Use this for user-level plugins:

Put `[seatbelt "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
seatbelt 0.1.0-SNAPSHOT`.

FIXME: Use this for project-level plugins:

Put `[seatbelt "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

FIXME: and add an example usage that actually makes sense:

    $ lein seatbelt

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
