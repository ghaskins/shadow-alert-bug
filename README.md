# shadow-alert-bug

This project, created with `lein new re-frame` demonstrates a problem discovered as a bad reaction between [Shadow CLJS](https://github.com/thheller/shadow-cljs) introduced around v2.11.x and including up to v2.14.4, and the Material UI [Alert](https://material-ui.com/components/alert/) component.  This is tracked [here](https://github.com/thheller/shadow-cljs/issues/900)

## Usage

```
npm install
```

```
npx shadow-cljs watch app
```

Then browse to http://localhost:8280/

## Relevant code

The interesting parts are [here](https://github.com/ghaskins/shadow-alert-bug/blob/main/src/shadow_alert_bug/views.cljs#L10)
