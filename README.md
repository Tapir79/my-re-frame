# my-re-frame

A [re-frame](https://github.com/Day8/re-frame) application designed to learn re-frame.
Re-frame is just a way to standardize the project structure.             

db.cljs = design the app state i.e. data structure         
subs.cljs = the query layer. Write and register subscription functions              
views.cljs = Write Reagent component functions             
events.cljs = write and register event handler functions    

# Subscribing           

| cljs     | code     |
| ------------- | ------------- |
|  db           | ``state {:name "a" :test "b"} `` |
|  subs         | ``reg-sub :name   ``   ``  reg-sub :test ``  |
|  views        | ``subscribe A [::subs/name]`` ``subscribe B [::subs/test]`` ``[:div "Hello " @A @B] ``|
                                    
Produces: ``Hello ab``  
           
                  
# Dispatching
  
| cljs | code |
| ------------- | ------------- |
| views  | ``:on-click #(re-frame/dispatch [::events/name-change "Name changed!"])``|
| events  | ``(re-frame/reg-event-db `` ``::name-change`` |
| db  | ``state {:name "Name changed!" :test "b"} ``|           
                     
            
## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```
