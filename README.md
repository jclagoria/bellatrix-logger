# Bellatrix - Log

# Modificaaciones que se deben tener en cuenta

Se listaran algunas de las modificaciones que se podrian realizar al codigo original

1.- Agregar archivo de configuracion y su recuperacion de cada una de los parametros.

2.- Separar logica de como se debe actuar segun lo que se encuentra parametrizado.

3.- Modificar la query del statement, ya que dara un error puesto que la query le faltan
definir los campos de la tabla. Ademas se tiene en cuenta que solamente se guarda valores
no significativos en la misma.

# A tener en cuenta:
En los archivos config.properties se debe agregar la configuracion, definiendo cual
seria la configuracion en si de la app.
En caso de no definir ningun valor, no se podra ejecutar correctamente la misma.