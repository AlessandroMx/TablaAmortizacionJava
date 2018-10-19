/*
 * An XML document type.
 * Localname: responseAmortizacion
 * Namespace: http://soa.com/amortizacion
 * Java type: com.soa.amortizacion.ResponseAmortizacionDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.amortizacion.impl;
/**
 * A document containing one responseAmortizacion(@http://soa.com/amortizacion) element.
 *
 * This is a complex type.
 */
public class ResponseAmortizacionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.ResponseAmortizacionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseAmortizacionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEAMORTIZACION$0 = 
        new javax.xml.namespace.QName("http://soa.com/amortizacion", "responseAmortizacion");
    
    
    /**
     * Gets the "responseAmortizacion" element
     */
    public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion getResponseAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion target = null;
            target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion)get_store().find_element_user(RESPONSEAMORTIZACION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responseAmortizacion" element
     */
    public void setResponseAmortizacion(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion responseAmortizacion)
    {
        generatedSetterHelperImpl(responseAmortizacion, RESPONSEAMORTIZACION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responseAmortizacion" element
     */
    public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion addNewResponseAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion target = null;
            target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion)get_store().add_element_user(RESPONSEAMORTIZACION$0);
            return target;
        }
    }
    /**
     * An XML responseAmortizacion(@http://soa.com/amortizacion).
     *
     * This is a complex type.
     */
    public static class ResponseAmortizacionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseAmortizacionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TABLA$0 = 
            new javax.xml.namespace.QName("http://soa.com/amortizacion", "tabla");
        
        
        /**
         * Gets the "tabla" element
         */
        public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla getTabla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla target = null;
                target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla)get_store().find_element_user(TABLA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "tabla" element
         */
        public void setTabla(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla tabla)
        {
            generatedSetterHelperImpl(tabla, TABLA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tabla" element
         */
        public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla addNewTabla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla target = null;
                target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla)get_store().add_element_user(TABLA$0);
                return target;
            }
        }
        /**
         * An XML tabla(@http://soa.com/amortizacion).
         *
         * This is a complex type.
         */
        public static class TablaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla
        {
            private static final long serialVersionUID = 1L;
            
            public TablaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REGISTRO$0 = 
                new javax.xml.namespace.QName("http://soa.com/amortizacion", "registro");
            
            
            /**
             * Gets array of all "registro" elements
             */
            public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[] getRegistroArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(REGISTRO$0, targetList);
                    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[] result = new com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "registro" element
             */
            public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro getRegistroArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro target = null;
                    target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro)get_store().find_element_user(REGISTRO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "registro" element
             */
            public int sizeOfRegistroArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REGISTRO$0);
                }
            }
            
            /**
             * Sets array of all "registro" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setRegistroArray(com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro[] registroArray)
            {
                check_orphaned();
                arraySetterHelper(registroArray, REGISTRO$0);
            }
            
            /**
             * Sets ith "registro" element
             */
            public void setRegistroArray(int i, com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro registro)
            {
                generatedSetterHelperImpl(registro, REGISTRO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "registro" element
             */
            public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro insertNewRegistro(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro target = null;
                    target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro)get_store().insert_element_user(REGISTRO$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "registro" element
             */
            public com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro addNewRegistro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro target = null;
                    target = (com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro)get_store().add_element_user(REGISTRO$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "registro" element
             */
            public void removeRegistro(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REGISTRO$0, i);
                }
            }
            /**
             * An XML registro(@http://soa.com/amortizacion).
             *
             * This is a complex type.
             */
            public static class RegistroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro
            {
                private static final long serialVersionUID = 1L;
                
                public RegistroImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PERIODO$0 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "periodo");
                private static final javax.xml.namespace.QName SALDOINICIAL$2 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "saldoInicial");
                private static final javax.xml.namespace.QName CUOTAS$4 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "cuotas");
                private static final javax.xml.namespace.QName INTERESES$6 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "intereses");
                private static final javax.xml.namespace.QName ABONOCAPITAL$8 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "abonoCapital");
                private static final javax.xml.namespace.QName SALDOFINAL$10 = 
                    new javax.xml.namespace.QName("http://soa.com/amortizacion", "saldoFinal");
                
                
                /**
                 * Gets the "periodo" element
                 */
                public int getPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODO$0, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "periodo" element
                 */
                public org.apache.xmlbeans.XmlInt xgetPeriodo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERIODO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "periodo" element
                 */
                public void setPeriodo(int periodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODO$0);
                      }
                      target.setIntValue(periodo);
                    }
                }
                
                /**
                 * Sets (as xml) the "periodo" element
                 */
                public void xsetPeriodo(org.apache.xmlbeans.XmlInt periodo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInt target = null;
                      target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERIODO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PERIODO$0);
                      }
                      target.set(periodo);
                    }
                }
                
                /**
                 * Gets the "saldoInicial" element
                 */
                public double getSaldoInicial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOINICIAL$2, 0);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "saldoInicial" element
                 */
                public org.apache.xmlbeans.XmlDouble xgetSaldoInicial()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDOINICIAL$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "saldoInicial" element
                 */
                public void setSaldoInicial(double saldoInicial)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOINICIAL$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOINICIAL$2);
                      }
                      target.setDoubleValue(saldoInicial);
                    }
                }
                
                /**
                 * Sets (as xml) the "saldoInicial" element
                 */
                public void xsetSaldoInicial(org.apache.xmlbeans.XmlDouble saldoInicial)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDOINICIAL$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALDOINICIAL$2);
                      }
                      target.set(saldoInicial);
                    }
                }
                
                /**
                 * Gets the "cuotas" element
                 */
                public double getCuotas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUOTAS$4, 0);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cuotas" element
                 */
                public org.apache.xmlbeans.XmlDouble xgetCuotas()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CUOTAS$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "cuotas" element
                 */
                public void setCuotas(double cuotas)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUOTAS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUOTAS$4);
                      }
                      target.setDoubleValue(cuotas);
                    }
                }
                
                /**
                 * Sets (as xml) the "cuotas" element
                 */
                public void xsetCuotas(org.apache.xmlbeans.XmlDouble cuotas)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CUOTAS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(CUOTAS$4);
                      }
                      target.set(cuotas);
                    }
                }
                
                /**
                 * Gets the "intereses" element
                 */
                public double getIntereses()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESES$6, 0);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "intereses" element
                 */
                public org.apache.xmlbeans.XmlDouble xgetIntereses()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESES$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "intereses" element
                 */
                public void setIntereses(double intereses)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESES$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESES$6);
                      }
                      target.setDoubleValue(intereses);
                    }
                }
                
                /**
                 * Sets (as xml) the "intereses" element
                 */
                public void xsetIntereses(org.apache.xmlbeans.XmlDouble intereses)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESES$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERESES$6);
                      }
                      target.set(intereses);
                    }
                }
                
                /**
                 * Gets the "abonoCapital" element
                 */
                public double getAbonoCapital()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABONOCAPITAL$8, 0);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "abonoCapital" element
                 */
                public org.apache.xmlbeans.XmlDouble xgetAbonoCapital()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ABONOCAPITAL$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "abonoCapital" element
                 */
                public void setAbonoCapital(double abonoCapital)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABONOCAPITAL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABONOCAPITAL$8);
                      }
                      target.setDoubleValue(abonoCapital);
                    }
                }
                
                /**
                 * Sets (as xml) the "abonoCapital" element
                 */
                public void xsetAbonoCapital(org.apache.xmlbeans.XmlDouble abonoCapital)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ABONOCAPITAL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ABONOCAPITAL$8);
                      }
                      target.set(abonoCapital);
                    }
                }
                
                /**
                 * Gets the "saldoFinal" element
                 */
                public double getSaldoFinal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOFINAL$10, 0);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "saldoFinal" element
                 */
                public org.apache.xmlbeans.XmlDouble xgetSaldoFinal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDOFINAL$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "saldoFinal" element
                 */
                public void setSaldoFinal(double saldoFinal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDOFINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDOFINAL$10);
                      }
                      target.setDoubleValue(saldoFinal);
                    }
                }
                
                /**
                 * Sets (as xml) the "saldoFinal" element
                 */
                public void xsetSaldoFinal(org.apache.xmlbeans.XmlDouble saldoFinal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDOFINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALDOFINAL$10);
                      }
                      target.set(saldoFinal);
                    }
                }
            }
        }
    }
}
