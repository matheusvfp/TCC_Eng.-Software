import { defineConfig } from "cypress";

export default defineConfig({
  e2e: {
    chromeWebSecurity:false,
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    baseUrl:'https://erickwendel.github.io/vanilla-js-web-app-example/',
    testIsolation:false
  },
});
