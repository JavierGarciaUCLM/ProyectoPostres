        
package sbc.example;

import java.util.ArrayList;
import java.util.List;

public class RecetasDatos {
        //Recetas... Rellenado por chatgpt, eran demasiadas para ponerlas todas

        public static List<Receta> crearRecetas() {
        List<Receta> list = new ArrayList<>();
        Receta r1 = new Receta("Tarta fría de queso");
        r1.setTiempoPreparacion(10);
        r1.setNecesitaHorno(false);
        r1.setDificultad(Dificultad.Facil);
        r1.setIngredientePrincipal("lácteos");
        r1.setTipoPostre("tarta");
        r1.setNumeroIngredientes(5);

        Receta r2 = new Receta("Tarta de galletas y chocolate");
        r2.setTiempoPreparacion(12);
        r2.setNecesitaHorno(false);
        r2.setDificultad(Dificultad.Facil);
        r2.setIngredientePrincipal("chocolate");
        r2.setTipoPostre("tarta");
        r2.setNumeroIngredientes(4);

        Receta r3 = new Receta("Flan casero rápido");
        r3.setTiempoPreparacion(8);
        r3.setNecesitaHorno(false);
        r3.setDificultad(Dificultad.Facil);
        r3.setIngredientePrincipal("lácteos");
        r3.setTipoPostre("flan");
        r3.setNumeroIngredientes(3);

        Receta r4 = new Receta("Bizcocho clásico esponjoso");
        r4.setTiempoPreparacion(25);
        r4.setNecesitaHorno(true);
        r4.setDificultad(Dificultad.Media);
        r4.setIngredientePrincipal("lácteos");
        r4.setTipoPostre("bizcocho");
        r4.setNumeroIngredientes(7);

        Receta r5 = new Receta("Brownie exprés");
        r5.setTiempoPreparacion(9);
        r5.setNecesitaHorno(false);
        r5.setDificultad(Dificultad.Facil);
        r5.setIngredientePrincipal("chocolate");
        r5.setTipoPostre("brownie");
        r5.setNumeroIngredientes(4);

        Receta r6 = new Receta("Helado casero de frutas");
        r6.setTiempoPreparacion(5);
        r6.setNecesitaHorno(false);
        r6.setDificultad(Dificultad.Facil);
        r6.setIngredientePrincipal("fruta");
        r6.setTipoPostre("helado");
        r6.setNumeroIngredientes(3);

        Receta r7 = new Receta("Tiramisú fácil");
        r7.setTiempoPreparacion(10);
        r7.setNecesitaHorno(false);
        r7.setDificultad(Dificultad.Facil);
        r7.setIngredientePrincipal("lácteos");
        r7.setTipoPostre("tarta");
        r7.setNumeroIngredientes(6);

        Receta r8 = new Receta("Galletas de avena sin horno");
        r8.setTiempoPreparacion(7);
        r8.setNecesitaHorno(false);
        r8.setDificultad(Dificultad.Facil);
        r8.setIngredientePrincipal("avena");
        r8.setTipoPostre("galletas");
        r8.setNumeroIngredientes(3);

        Receta r9 = new Receta("Tarta de limón cremosa");
        r9.setTiempoPreparacion(14);
        r9.setNecesitaHorno(false);
        r9.setDificultad(Dificultad.Media);
        r9.setIngredientePrincipal("limón");
        r9.setTipoPostre("tarta");
        r9.setNumeroIngredientes(6);

        Receta r10 = new Receta("Tarta de chocolate al horno");
        r10.setTiempoPreparacion(20);
        r10.setNecesitaHorno(true);
        r10.setDificultad(Dificultad.Media);
        r10.setIngredientePrincipal("chocolate");
        r10.setTipoPostre("tarta");
        r10.setNumeroIngredientes(7);

        Receta r11 = new Receta("Mousse de chocolate");
        r11.setTiempoPreparacion(10);
        r11.setNecesitaHorno(false);
        r11.setDificultad(Dificultad.Facil);
        r11.setIngredientePrincipal("chocolate");
        r11.setTipoPostre("mousse");
        r11.setNumeroIngredientes(4);

        Receta r12 = new Receta("Flan de café sin horno");
        r12.setTiempoPreparacion(9);
        r12.setNecesitaHorno(false);
        r12.setDificultad(Dificultad.Facil);
        r12.setIngredientePrincipal("café");
        r12.setTipoPostre("flan");
        r12.setNumeroIngredientes(4);

        Receta r13 = new Receta("Pastel de yogur");
        r13.setTiempoPreparacion(15);
        r13.setNecesitaHorno(true);
        r13.setDificultad(Dificultad.Media);
        r13.setIngredientePrincipal("lácteos");
        r13.setTipoPostre("pastel");
        r13.setNumeroIngredientes(6);

        Receta r14 = new Receta("Tarta fría de piña");
        r14.setTiempoPreparacion(8);
        r14.setNecesitaHorno(false);
        r14.setDificultad(Dificultad.Facil);
        r14.setIngredientePrincipal("fruta");
        r14.setTipoPostre("tarta");
        r14.setNumeroIngredientes(4);

        Receta r15 = new Receta("Batido espeso de chocolate");
        r15.setTiempoPreparacion(4);
        r15.setNecesitaHorno(false);
        r15.setDificultad(Dificultad.Facil);
        r15.setIngredientePrincipal("chocolate");
        r15.setTipoPostre("batido");
        r15.setNumeroIngredientes(3);

        Receta r16 = new Receta("Galletas clásicas al horno");
        r16.setTiempoPreparacion(18);
        r16.setNecesitaHorno(true);
        r16.setDificultad(Dificultad.Media);
        r16.setIngredientePrincipal("avena");
        r16.setTipoPostre("galletas");
        r16.setNumeroIngredientes(6);

        Receta r17 = new Receta("Tarta fría de tres chocolates");
        r17.setTiempoPreparacion(12);
        r17.setNecesitaHorno(false);
        r17.setDificultad(Dificultad.Media);
        r17.setIngredientePrincipal("chocolate");
        r17.setTipoPostre("tarta");
        r17.setNumeroIngredientes(8);

        Receta r18 = new Receta("Manzanas caramelizadas");
        r18.setTiempoPreparacion(10);
        r18.setNecesitaHorno(false);
        r18.setDificultad(Dificultad.Facil);
        r18.setIngredientePrincipal("fruta");
        r18.setTipoPostre("caramelo");
        r18.setNumeroIngredientes(3);

        Receta r19 = new Receta("Bizcocho de limón");
        r19.setTiempoPreparacion(20);
        r19.setNecesitaHorno(true);
        r19.setDificultad(Dificultad.Media);
        r19.setIngredientePrincipal("limón");
        r19.setTipoPostre("bizcocho");
        r19.setNumeroIngredientes(7);

        Receta r20 = new Receta("Galletas de mantequilla");
        r20.setTiempoPreparacion(15);
        r20.setNecesitaHorno(true);
        r20.setDificultad(Dificultad.Media);
        r20.setIngredientePrincipal("lácteos");
        r20.setTipoPostre("galletas");
        r20.setNumeroIngredientes(5);

        Receta r21 = new Receta("Tarta fría de melocotón");
        r21.setTiempoPreparacion(9);
        r21.setNecesitaHorno(false);
        r21.setDificultad(Dificultad.Facil);
        r21.setIngredientePrincipal("fruta");
        r21.setTipoPostre("tarta");
        r21.setNumeroIngredientes(4);

        Receta r22 = new Receta("Crema de chocolate rápida");
        r22.setTiempoPreparacion(6);
        r22.setNecesitaHorno(false);
        r22.setDificultad(Dificultad.Facil);
        r22.setIngredientePrincipal("chocolate");
        r22.setTipoPostre("crema");
        r22.setNumeroIngredientes(3);

        Receta r23 = new Receta("Flan de queso");
        r23.setTiempoPreparacion(11);
        r23.setNecesitaHorno(false);
        r23.setDificultad(Dificultad.Media);
        r23.setIngredientePrincipal("lácteos");
        r23.setTipoPostre("flan");
        r23.setNumeroIngredientes(5);

        Receta r24 = new Receta("Tarta de avena sin horno");
        r24.setTiempoPreparacion(10);
        r24.setNecesitaHorno(false);
        r24.setDificultad(Dificultad.Facil);
        r24.setIngredientePrincipal("avena");
        r24.setTipoPostre("tarta");
        r24.setNumeroIngredientes(4);

        Receta r25 = new Receta("Tarta de chocolate microondas");
        r25.setTiempoPreparacion(7);
        r25.setNecesitaHorno(false);
        r25.setDificultad(Dificultad.Facil);
        r25.setIngredientePrincipal("chocolate");
        r25.setTipoPostre("tarta");
        r25.setNumeroIngredientes(3);

        Receta r26 = new Receta("Bizcocho rápido microondas");
        r26.setTiempoPreparacion(8);
        r26.setNecesitaHorno(false);
        r26.setDificultad(Dificultad.Facil);
        r26.setIngredientePrincipal("lácteos");
        r26.setTipoPostre("bizcocho");
        r26.setNumeroIngredientes(4);

        Receta r27 = new Receta("Tarta fría de fresa");
        r27.setTiempoPreparacion(9);
        r27.setNecesitaHorno(false);
        r27.setDificultad(Dificultad.Facil);
        r27.setIngredientePrincipal("fruta");
        r27.setTipoPostre("tarta");
        r27.setNumeroIngredientes(5);

        Receta r28 = new Receta("Galletas de cacao");
        r28.setTiempoPreparacion(14);
        r28.setNecesitaHorno(true);
        r28.setDificultad(Dificultad.Media);
        r28.setIngredientePrincipal("chocolate");
        r28.setTipoPostre("galletas");
        r28.setNumeroIngredientes(6);

        Receta r29 = new Receta("Copa cremosa de yogur");
        r29.setTiempoPreparacion(5);
        r29.setNecesitaHorno(false);
        r29.setDificultad(Dificultad.Facil);
        r29.setIngredientePrincipal("lácteos");
        r29.setTipoPostre("copa");
        r29.setNumeroIngredientes(3);

        Receta r30 = new Receta("Pastel de manzana");
        r30.setTiempoPreparacion(22);
        r30.setNecesitaHorno(true);
        r30.setDificultad(Dificultad.Media);
        r30.setIngredientePrincipal("fruta");
        r30.setTipoPostre("pastel");
        r30.setNumeroIngredientes(7);

        Receta r31 = new Receta("Mousse de limón");
        r31.setTiempoPreparacion(7);
        r31.setNecesitaHorno(false);
        r31.setDificultad(Dificultad.Facil);
        r31.setIngredientePrincipal("limón");
        r31.setTipoPostre("mousse");
        r31.setNumeroIngredientes(3);

        Receta r32 = new Receta("Tarta fría de mango");
        r32.setTiempoPreparacion(9);
        r32.setNecesitaHorno(false);
        r32.setDificultad(Dificultad.Facil);
        r32.setIngredientePrincipal("fruta");
        r32.setTipoPostre("tarta");
        r32.setNumeroIngredientes(4);

        Receta r33 = new Receta("Bizcocho de cacao");
        r33.setTiempoPreparacion(18);
        r33.setNecesitaHorno(true);
        r33.setDificultad(Dificultad.Media);
        r33.setIngredientePrincipal("chocolate");
        r33.setTipoPostre("bizcocho");
        r33.setNumeroIngredientes(7);

        Receta r34 = new Receta("Flan de vainilla");
        r34.setTiempoPreparacion(10);
        r34.setNecesitaHorno(false);
        r34.setDificultad(Dificultad.Facil);
        r34.setIngredientePrincipal("lácteos");
        r34.setTipoPostre("flan");
        r34.setNumeroIngredientes(4);

        Receta r35 = new Receta("Tarta fría de Oreo");
        r35.setTiempoPreparacion(12);
        r35.setNecesitaHorno(false);
        r35.setDificultad(Dificultad.Media);
        r35.setIngredientePrincipal("galletas");
        r35.setTipoPostre("tarta");
        r35.setNumeroIngredientes(5);

        Receta r36 = new Receta("Galletas de limón");
        r36.setTiempoPreparacion(16);
        r36.setNecesitaHorno(true);
        r36.setDificultad(Dificultad.Media);
        r36.setIngredientePrincipal("limón");
        r36.setTipoPostre("galletas");
        r36.setNumeroIngredientes(6);

        Receta r37 = new Receta("Tarta helada de yogur");
        r37.setTiempoPreparacion(8);
        r37.setNecesitaHorno(false);
        r37.setDificultad(Dificultad.Facil);
        r37.setIngredientePrincipal("lácteos");
        r37.setTipoPostre("tarta");
        r37.setNumeroIngredientes(4);

        Receta r38 = new Receta("Flan de coco");
        r38.setTiempoPreparacion(11);
        r38.setNecesitaHorno(false);
        r38.setDificultad(Dificultad.Media);
        r38.setIngredientePrincipal("lácteos");
        r38.setTipoPostre("flan");
        r38.setNumeroIngredientes(5);

        Receta r39 = new Receta("Tarta de chocolate crujiente");
        r39.setTiempoPreparacion(13);
        r39.setNecesitaHorno(false);
        r39.setDificultad(Dificultad.Media);
        r39.setIngredientePrincipal("chocolate");
        r39.setTipoPostre("tarta");
        r39.setNumeroIngredientes(6);

        Receta r40 = new Receta("Tarta de plátano fría");
        r40.setTiempoPreparacion(9);
        r40.setNecesitaHorno(false);
        r40.setDificultad(Dificultad.Facil);
        r40.setIngredientePrincipal("fruta");
        r40.setTipoPostre("tarta");
        r40.setNumeroIngredientes(4);

        Receta r41 = new Receta("Copa triple de chocolate");
        r41.setTiempoPreparacion(10);
        r41.setNecesitaHorno(false);
        r41.setDificultad(Dificultad.Media);
        r41.setIngredientePrincipal("chocolate");
        r41.setTipoPostre("copa");
        r41.setNumeroIngredientes(5);

        Receta r42 = new Receta("Helado cremoso de limón");
        r42.setTiempoPreparacion(6);
        r42.setNecesitaHorno(false);
        r42.setDificultad(Dificultad.Facil);
        r42.setIngredientePrincipal("limón");
        r42.setTipoPostre("helado");
        r42.setNumeroIngredientes(3);

        Receta r43 = new Receta("Tarta de queso al horno");
        r43.setTiempoPreparacion(20);
        r43.setNecesitaHorno(true);
        r43.setDificultad(Dificultad.Media);
        r43.setIngredientePrincipal("lácteos");
        r43.setTipoPostre("tarta");
        r43.setNumeroIngredientes(7);

        Receta r44 = new Receta("Pastel frío de chocolate blanco");
        r44.setTiempoPreparacion(12);
        r44.setNecesitaHorno(false);
        r44.setDificultad(Dificultad.Media);
        r44.setIngredientePrincipal("chocolate");
        r44.setTipoPostre("pastel");
        r44.setNumeroIngredientes(6);

        Receta r45 = new Receta("Galletas de avena y miel");
        r45.setTiempoPreparacion(14);
        r45.setNecesitaHorno(true);
        r45.setDificultad(Dificultad.Media);
        r45.setIngredientePrincipal("avena");
        r45.setTipoPostre("galletas");
        r45.setNumeroIngredientes(6);

        Receta r46 = new Receta("Tarta fría de yogur y frutas");
        r46.setTiempoPreparacion(10);
        r46.setNecesitaHorno(false);
        r46.setDificultad(Dificultad.Facil);
        r46.setIngredientePrincipal("fruta");
        r46.setTipoPostre("tarta");
        r46.setNumeroIngredientes(5);

        Receta r47 = new Receta("Mousse de fresas");
        r47.setTiempoPreparacion(7);
        r47.setNecesitaHorno(false);
        r47.setDificultad(Dificultad.Facil);
        r47.setIngredientePrincipal("fruta");
        r47.setTipoPostre("mousse");
        r47.setNumeroIngredientes(3);

        Receta r48 = new Receta("Tarta fría de caramelo");
        r48.setTiempoPreparacion(12);
        r48.setNecesitaHorno(false);
        r48.setDificultad(Dificultad.Media);
        r48.setIngredientePrincipal("caramelo");
        r48.setTipoPostre("tarta");
        r48.setNumeroIngredientes(6);

        Receta r49 = new Receta("Bizcocho de yogur");
        r49.setTiempoPreparacion(18);
        r49.setNecesitaHorno(true);
        r49.setDificultad(Dificultad.Media);
        r49.setIngredientePrincipal("lácteos");
        r49.setTipoPostre("bizcocho");
        r49.setNumeroIngredientes(6);

        Receta r50 = new Receta("Galletas rápidas sin horno");
        r50.setTiempoPreparacion(6);
        r50.setNecesitaHorno(false);
        r50.setDificultad(Dificultad.Facil);
        r50.setIngredientePrincipal("galletas");
        r50.setTipoPostre("galletas");
        r50.setNumeroIngredientes(3);

        return list;
        }
    }